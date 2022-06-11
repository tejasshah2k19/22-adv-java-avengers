package com.util;

import java.util.ArrayList;

import com.bean.ExpUserBean;

public class UserStorage {
	public static ArrayList<ExpUserBean> users = new ArrayList<ExpUserBean>();

}
//server --> UserStorage --> users [ 1 and only 1 copy ] 

