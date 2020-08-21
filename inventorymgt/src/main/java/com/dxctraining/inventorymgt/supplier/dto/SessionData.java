package com.dxctraining.inventorymgt.supplier.dto;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SessionData {

	private int id = -1;

	private boolean loggedIn;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

	public SessionData(int id) {
		this.id = id;
	}

	public SessionData() {
	}

	public void saveLogin(int id) {
		this.loggedIn = true;
		this.id = id;
	}

	public void clear() {
		id = -1;
		loggedIn = false;
	}

}