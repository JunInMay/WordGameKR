package com.view.console;

import com.logic.Game;


/**
 * 
 * @author Chana
 * @Description 콘솔 환경에서 게임 실행
 *
 */
public class Console {
	public static void main(String[] args) {
		Game game = new Game();
		game.play();
	}
}
