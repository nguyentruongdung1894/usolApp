package usol.com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import usol.com.entity.userEntity;
import usol.com.model.userModel;

@Controller
public class userController {

	private static userModel uModel;

	public userController() {
		uModel = new userModel();
	}

	@RequestMapping("loginForm.htm")
	public String login() {
		return "login";
	}
	
	@RequestMapping("login.htm")
	public String login(HttpServletRequest request, ModelMap mm) {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		boolean check = uModel.loginUser(userName, password);
		if (check == false) {
			mm.put("msg", "The username or password is incorrect!");
			return "error";

		}
		return "home";
	}

	@RequestMapping("getAllUser.htm")
	public String getAllUser(HttpSession session) {
		List<userEntity> list = new ArrayList<userEntity>();
		list = uModel.getAllUser();
		session.setAttribute("userList", list);
		return "getAllUser";
	}

	@RequestMapping("insertUser.htm")
	public String insertProduct() {
		return "insertUser";
	}

	@RequestMapping("insertUserSucces.htm")
	public String insertSuccProduct(HttpServletRequest request, ModelMap mm) {
		String model = null;
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		boolean role = Boolean.parseBoolean((request.getParameter("role")));
		if (uModel.insertUser(userName, password, role)) {
			mm.put("message", "Insert success!");
			model = "redirect:getAllUser.htm";
		} else {
			mm.put("msg", "Insert fail!");
			model = "error";
		}
		return model;
	}

	@RequestMapping("updateUser.htm")
	public ModelAndView updateUser(int userID) {
		ModelAndView model = new ModelAndView("updateUser");
		userEntity uEntity = uModel.getUserById(userID);
		model.getModelMap().addAttribute("user", uEntity);
		return model;
	}

	@RequestMapping("updateUserSucces.htm")
	public String updateSuccUser(userEntity userEntity) {
		String model = null;
		if (uModel.updateUser(userEntity)) {
			model = "redirect:getAllUser.htm";
		} else {
			model = "error";
		}
		return model;
	}

	@RequestMapping("deleteUser.htm")
	public ModelAndView deleteUser(int userID) {
		ModelAndView model = new ModelAndView("deleteUser");
		userEntity uEntity = uModel.getUserById(userID);
		model.getModelMap().addAttribute("user", uEntity);
		return model;
	}

	@RequestMapping("deleteUserSucces.htm")
	public String deleteSuccUser(userEntity userEntity) {
		String model = null;
		if (uModel.deleteUser(userEntity)) {
			model = "redirect:getAllUser.htm";
		} else {
			model = "error";
		}
		return model;
	}
}
