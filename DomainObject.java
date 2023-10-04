public class DomainObject {
	public DomainObject(String name) {
		_name = name;
	};

	public DomainObject() {
	};

	public static String name() {
		return _name;
	};

	public String toString() {
		return _name;
	};

	public static String get_name() {
		return _name;
	}

	public static void set_name(String _name) {
		DomainObject._name = _name;
	}

	private static String _name = "no name";
}