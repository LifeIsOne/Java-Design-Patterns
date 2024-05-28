package ex05.teacher;

public abstract class Teacher {
    public void teachClass(){
        enter();
        takeAttendance();
        giveLecture();
        exit();
    }

    public void enter(){
        System.out.println("enter");
    }
    public void takeAttendance(){
        System.out.println("take attendance");
    }
    public abstract void giveLecture();

    public void exit(){
        System.out.println("exit");
    }
}
