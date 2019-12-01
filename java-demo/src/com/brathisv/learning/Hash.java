package com.brathisv.learning;

public final class Hash {

	private final String value;
	
	public Hash(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}

	@Override
	public int hashCode() {
		if("abc".equals(value) || "cba".equals(value))
			return "abc".hashCode();
		
		final int prime = 31;
		int result = 1;
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hash other = (Hash) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Hash [value=" + value + "]";
	}
	
	
	
}
