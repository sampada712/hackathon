package com.linkedin.hack.reco.pojo.profile.position;

import com.linkedin.hack.reco.pojo.profile.position.Values;

public class Positions {
	private Values[] values;

	private String _total;

	public Values[] getValues() {
		return values;
	}

	public void setValues(Values[] values) {
		this.values = values;
	}

	public String get_total() {
		return _total;
	}

	public void set_total(String _total) {
		this._total = _total;
	}
}