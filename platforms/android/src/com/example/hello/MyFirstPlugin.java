package com.example.hello;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import android.widget.Toast;

public class MyFirstPlugin extends CordovaPlugin {

	@Override
	public boolean execute(String action, JSONArray args,
			CallbackContext callbackContext) throws JSONException {
		
		callbackContext.success();
		System.out.println("プラグイン：" + args.getString(0));
		
		android.widget.Toast.makeText(
				this.cordova.getActivity(), args.getString(0), Toast.LENGTH_LONG).show();
		return true;
	}
}
