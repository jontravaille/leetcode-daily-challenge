public String defangIPaddr(String address) {
//        A defanged IP address replaces every period "." with "[.]".
//
//
//
//        Example 1:
//
//        Input: address = "1.1.1.1"
//        Output: "1[.]1[.]1[.]1"
//        Example 2:
//
//        Input: address = "255.100.50.0"
//        Output: "255[.]100[.]50[.]0"
//
//
//        Constraints:
//
//        The given address is a valid IPv4 address.
    // The interview question does not want us to utilize replace

    String ret = address.replace('.', '[.]');
}