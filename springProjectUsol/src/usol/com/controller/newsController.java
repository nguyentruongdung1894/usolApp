package usol.com.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import usol.com.entity.newsEntity;
import usol.com.model.newsModel;

@Controller
public class newsController {
	private static newsModel nModel;

	public newsController() {
		nModel = new newsModel();
	}

	@RequestMapping("getAllNews.htm")
	public String getAllCategory(HttpSession session) {
		List<newsEntity> list = new ArrayList<newsEntity>();
		list = nModel.getAllNews();
		session.setAttribute("newsList", list);
		return "getAllNews";
	}

	@RequestMapping("insertNews.htm")
	public String insertProduct() {
		return "insertNews";
	}

	@RequestMapping("insertNewsSucces.htm")
	public String insertSuccProduct(HttpServletRequest request, ModelMap mm) {
		String model = null;
		String newsName = request.getParameter("newsName");
		String description = request.getParameter("description");
		String detail = request.getParameter("detail");
		String image = request.getParameter("image");
		String date = request.getParameter("date");
		int categoryID = Integer.parseInt(request.getParameter("categoryID"));
		int userID = Integer.parseInt(request.getParameter("userID"));
		boolean status = Boolean.parseBoolean((request.getParameter("status")));	
		newsEntity nEntity = new newsEntity(newsName, description, detail, image, Date.valueOf(date), categoryID, userID, status);
		if (nModel.insertNews(nEntity)) {
			mm.put("message", "Insert success!");
			model = "redirect:getAllNews.htm";
		} else {
			mm.put("msg", "Insert fail!");
			model = "error";
		}
		return model;
	}

	@RequestMapping("updateNews.htm")
	public ModelAndView updateUser(int newsID) {
		ModelAndView model = new ModelAndView("updateNews");
		newsEntity nEntity = nModel.getNewsById(newsID);
		model.getModelMap().addAttribute("news", nEntity);
		return model;
	}

	@RequestMapping("updateNewsSucces.htm")
	public String updateSuccUser(newsEntity nEntity) {
		String model = null;
		if (nModel.updateNews(nEntity)) {
			model = "redirect:getAllNews.htm";
		} else {
			model = "error";
		}
		return model;
	}

	@RequestMapping("deleteNews.htm")
	public ModelAndView deleteNews(int newsID) {
		ModelAndView model = new ModelAndView("deleteNews");
		newsEntity nEntity = nModel.getNewsById(newsID);
		model.getModelMap().addAttribute("news", nEntity);
		return model;
	}

	@RequestMapping("deleteNewsSucces.htm")
	public String deleteSuccUser(newsEntity nEntity) {
		String model = null;
		if (nModel.deleteNews(nEntity)) {
			model = "redirect:getAllNews.htm";
		} else {
			model = "error";
		}
		return model;
	}
}
