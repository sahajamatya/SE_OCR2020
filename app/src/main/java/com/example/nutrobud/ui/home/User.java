package com.example.nutrobud.ui.home;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class User implements Parcelable{
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String secondName;
    private int age;
    private String gender;
    private int weight;
    private List<String> ingredientsNo;
    private List<String> ingredientsYes;
    private ArrayList<Integer> ingredientsYesGoalsQty;
    private ArrayList<Integer> ingredientsYesTrackedQty;
    private int calorieGoalsQty;
    private int calorieTrackedQty;
    private Map<String, Stats> stats;


    public User(){
        age = -1;
        weight = -1;
    }

    public User(int id, String email, String password, String firstName, String secondName, int age, String gender, int weight, List<String> ingredientsNo, List<String> ingredientsYes, ArrayList<Integer> ingredientsYesGoalsQty, ArrayList<Integer> ingredientsYesTrackedQty, int calorieGoalsQty, int calorieTrackedQty, Map<String, Stats> stats) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.ingredientsNo = ingredientsNo;
        this.ingredientsYes = ingredientsYes;
        this.ingredientsYesGoalsQty = ingredientsYesGoalsQty;
        this.ingredientsYesTrackedQty = ingredientsYesTrackedQty;
        this.calorieGoalsQty = calorieGoalsQty;
        this.calorieTrackedQty = calorieTrackedQty;
        this.stats = stats;
    }

    private User(Parcel in) {
        email = in.readString();
        password = in.readString();
        firstName = in.readString();
        secondName = in.readString();
        age = in.readInt();
        gender = in.readString();
        weight = in.readInt();
        ingredientsNo = in.createStringArrayList();
        ingredientsYes = in.createStringArrayList();
        ingredientsYesGoalsQty = new ArrayList<Integer>();
        in.readList(ingredientsYesGoalsQty, null);
        ingredientsYesTrackedQty = new ArrayList<Integer>();
        in.readList(ingredientsYesTrackedQty, null);
        calorieGoalsQty = in.readInt();
        calorieTrackedQty = in.readInt();
    }

    public static final Parcelable.Creator<User> CREATOR = new Parcelable.Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public List<String> getIngredientsNo() {
        return ingredientsNo;
    }

    public void setIngredientsNo(List<String> ingredientsNo) {
        this.ingredientsNo = ingredientsNo;
    }

    public List<String> getIngredientsYes() {
        return ingredientsYes;
    }

    public void setIngredientsYes(List<String> ingredientsYes) {
        this.ingredientsYes = ingredientsYes;
    }

    public List<Integer> getIngredientsYesGoalsQty() {
        return ingredientsYesGoalsQty;
    }

    public void setIngredientsYesGoalsQty(ArrayList<Integer> ingredientsYesGoalsQty) {
        this.ingredientsYesGoalsQty = ingredientsYesGoalsQty;
    }

    public List<Integer> getIngredientsYesTrackedQty() {
        return ingredientsYesTrackedQty;
    }

    public void setIngredientsYesTrackedQty(ArrayList<Integer> ingredientsYesTrackedQty) {
        this.ingredientsYesTrackedQty = ingredientsYesTrackedQty;
    }

    public int getCalorieGoalsQty() {
        return calorieGoalsQty;
    }

    public void setCalorieGoalsQty(int calorieGoalsQty) {
        this.calorieGoalsQty = calorieGoalsQty;
    }

    public int getcalorieTrackedQty() {
        return calorieTrackedQty;
    }

    public void setcalorieTrackedQty(int calorieTrackedQty) {
        this.calorieTrackedQty = calorieTrackedQty;
    }

    public Map<String, Stats> getStats() {
        return stats;
    }

    public void setStats(Map<String, Stats> stats) {
        this.stats = stats;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(email);
        dest.writeString(password);
        dest.writeString(firstName);
        dest.writeString(secondName);
        dest.writeInt(age);
        dest.writeString(gender);
        dest.writeInt(weight);
        dest.writeStringList(ingredientsNo);
        dest.writeStringList(ingredientsYes);
        dest.writeInt(calorieGoalsQty);
        dest.writeInt(calorieTrackedQty);
    }
}

    private List<Integer> ingredientsYesGoalsQty;
    private List<Integer> ingredientsYesTrackedQty;
    private int calorieGoalsQty;
    private int calorieTrackedQty;
    private Map<String, Stats> stats;


    public User(){
        age = -1;
        weight = -1;
    }

    public User(int id, String email, String password, String firstName, String secondName, int age, String gender, int weight, List<String> ingredientsNo, List<String> ingredientsYes, List<Integer> ingredientsYesGoalsQty, List<Integer> ingredientsYesTrackedQty, int calorieGoalsQty, int calorieTrackedQty, Map<String, Stats> stats) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.ingredientsNo = ingredientsNo;
        this.ingredientsYes = ingredientsYes;
        this.ingredientsYesGoalsQty = ingredientsYesGoalsQty;
        this.ingredientsYesTrackedQty = ingredientsYesTrackedQty;
        this.calorieGoalsQty = calorieGoalsQty;
        this.calorieTrackedQty = calorieTrackedQty;
        this.stats = stats;
    }

    private User(Parcel in) {
        email = in.readString();
        password = in.readString();
        firstName = in.readString();
        secondName = in.readString();
        age = in.readInt();
        gender = in.readString();
        weight = in.readInt();
        ingredientsNo = in.createStringArrayList();
        ingredientsYes = in.createStringArrayList();
        calorieGoalsQty = in.readInt();
        calorieTrackedQty = in.readInt();
    }

    public static final Parcelable.Creator<User> CREATOR = new Parcelable.Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public List<String> getIngredientsNo() {
        return ingredientsNo;
    }

    public void setIngredientsNo(List<String> ingredientsNo) {
        this.ingredientsNo = ingredientsNo;
    }

    public List<String> getIngredientsYes() {
        return ingredientsYes;
    }

    public void setIngredientsYes(List<String> ingredientsYes) {
        this.ingredientsYes = ingredientsYes;
    }

    public List<Integer> getIngredientsYesGoalsQty() {
        return ingredientsYesGoalsQty;
    }

    public void setIngredientsYesGoalsQty(List<Integer> ingredientsYesGoalsQty) {
        this.ingredientsYesGoalsQty = ingredientsYesGoalsQty;
    }

    public List<Integer> getIngredientsYesTrackedQty() {
        return ingredientsYesTrackedQty;
    }

    public void setIngredientsYesTrackedQty(List<Integer> ingredientsYesTrackedQty) {
        this.ingredientsYesTrackedQty = ingredientsYesTrackedQty;
    }

    public int getCalorieGoalsQty() {
        return calorieGoalsQty;
    }

    public void setCalorieGoalsQty(int calorieGoalsQty) {
        this.calorieGoalsQty = calorieGoalsQty;
    }

    public int getcalorieTrackedQty() {
        return calorieTrackedQty;
    }

    public void setcalorieTrackedQty(int calorieTrackedQty) {
        this.calorieTrackedQty = calorieTrackedQty;
    }

    public Map<String, Stats> getStats() {
        return stats;
    }

    public void setStats(Map<String, Stats> stats) {
        this.stats = stats;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(email);
        dest.writeString(password);
        dest.writeString(firstName);
        dest.writeString(secondName);
        dest.writeInt(age);
        dest.writeString(gender);
        dest.writeInt(weight);
        dest.writeStringList(ingredientsNo);
        dest.writeStringList(ingredientsYes);
        dest.writeInt(calorieGoalsQty);
        dest.writeInt(calorieTrackedQty);
    }
}
