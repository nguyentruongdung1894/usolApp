package usol.com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import usol.com.entity.categoryEntity;
import usol.com.model.categoryModel;

@Controller
public class categoryController {
	private static categoryModel cModel;

	public categoryController() {
		cModel = new categoryModel();
	}
	
	@RequestMapping("/index.htm")
	public String index(HttpSession session) {
		List<categoryEntity> list = new ArrayList<categoryEntity>();
		list = cModel.getAllCategory();
		session.setAttribute("categoryName", list);
		return "index";
	}
	
	@RequestMapping("getAllCategory.htm")
	public String getAllCategory(HttpSession session) {
		List<categoryEntity> list = new ArrayList<categoryEntity>();
		list = cModel.getAllCategory();
		session.setAttribute("categoryList", list);
		return "getAllCategory";
	}

	@RequestMapping("insertCategory.htm")
	public String insertProduct() {
		return "insertCategory";
	}

	@RequestMapping("insertCategorySucces.htm")
	public String insertSuccProduct(HttpServletRequest request, ModelMap mm) {
		String model = null;
		String categoryName = request.getParameter("categoryName");
		String description = request.getParameter("description");
		boolean status = Boolean.parseBoolean((request.getParameter("status")));
		if (cModel.insertCategory(categoryName, description, status)) {
			mm.put("message", "Insert success!");
			model = "redirect:getAllCategory.htm";
		} else {
			mm.put("msg", "Insert fail!");
			model = "error";
		}
		return model;
	}

	@RequestMapping("updateCategory.htm")
	public ModelAndView updateUser(int categoryID) {
		ModelAndView model = new ModelAndView("updateCategory");
		categoryEntity cEntity = cModel.getCategoryById(categoryID);
		model.getModelMap().addAttribute("category", cEntity);
		return model;
	}

	@RequestMapping("updateCategorySucces.htm")
	public String updateSuccUser(categoryEntity cserEntity) {
		String model = null;
		if (cModel.updateCategory(cserEntity)) {
			model = "redirect:getAllCategory.htm";
		} else {
			model = "error";
		}
		return model;
	}

	@RequestMapping("deleteCategory.htm")
	public ModelAndView deleteUser(int categoryID) {
		ModelAndView model = new ModelAndView("deleteCategory");
		categoryEntity cEntity = cModel.getCategoryById(categoryID);
		model.getModelMap().addAttribute("user", cEntity);
		return model;
	}

	@RequestMapping("deleteCategorySucces.htm")
	public String deleteSuccUser(categoryEntity userEntity) {
		String model = null;
		if (cModel.deleteCategory(userEntity)) {
			model = "redirect:getAllCategory.htm";
		} else {
			model = "error";
		}
		return model;
	}
}
