package pl.grandhost.kristof.tenniskata.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pl.grandhost.kristof.tenniskata.TennisGame;

public class PlayTheGame extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request,
			HttpServletResponse response)
					throws IOException, ServletException {
			TennisGame tg = new TennisGame();
			request.setAttribute("competitionResult", tg.playTheGame());
			RequestDispatcher view =
					request.getRequestDispatcher("result.jsp");
					view.forward(request, response);
			}

	
	
}
