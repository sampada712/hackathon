package com.linkedin.hack.reco.pojo.search;


public class People {
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
