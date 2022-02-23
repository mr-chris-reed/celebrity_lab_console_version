//Celebrity class
class Celebrity{
  //instance variables
  private String name;
  private String hint;

  //empty constructor
  public Celebrity(){
    this.name = "";
    this.hint = "";
  }
  //constructor with parameters
  public Celebrity(String name, String hint){
    this.name = name;
    this.hint = hint;
  }

  public String getHint(){
    return this.hint;
  }

  public String getName(){
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setHint(String hint){
    this.hint = hint;
  }

  public String toString(){
    return "Celebrity: " + this.name + " Hint: " + this.hint;
  }

}