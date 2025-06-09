package Prototype;

public class IntelligentStudent extends Student{
    private float iq;

    private IntelligentStudent(){}

    private IntelligentStudent(IntelligentStudent old){
        super(old);
        this.iq=old.iq;
    }
    public float getIq(){
        return this.iq;
    }
    public void setIq(float iq){
        this.iq = iq; 
    }

    @Override
    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
    }
}
