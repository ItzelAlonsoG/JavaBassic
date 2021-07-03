class Family {


    public String _name;
    public int _age;
    public String _relation;

    public Family(String _name, int _age, String _relation){
        this._name = _name;
        this._age =_age;
        this._relation =_relation;
        this.printFamilyMember();

    }

    void printFamilyMember(){
        System.out.println("Hi I'am " + _name + " I have " + _age + " years old and I'm Itzel's " + _relation);
    }


}
