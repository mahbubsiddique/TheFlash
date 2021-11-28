package basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentsAndCoursePairs {
	
	
    public static Map<String[], List<String>> coursePair(String coursePairs [][]){
        Map<String, List> map = new HashMap<>();
        List<String> courseNameList = new ArrayList<>();
        for(int j=0; j<coursePairs.length; j++){
            String courseNum = coursePairs[j][0];
            String courseName = coursePairs[j][1];
            if(!map.containsKey(courseNum)){
                map.put(courseNum,new ArrayList<>());
            }
            map.get(courseNum).add(courseName);
        }
        Map<String[], List<String>> commonPairs = new HashMap<>();
        for(int i=0; i<coursePairs.length; i++){
            for(int j=i+1; j<coursePairs.length; j++){
                String courseNum1 = coursePairs[i][0];
                String courseNum2 = coursePairs[j][0];
                if(map.containsKey(courseNum1) && map.containsKey(courseNum2) && !courseNum1.equals(courseNum2)){
                    List<String> list1 = map.get(courseNum1);
                    List<String> list2 = map.get(courseNum2);
                    List<String> common = commonElements(list1,list2);
                    String pair [] = new String [2];
                    pair[0] = courseNum1;
                    pair[1] = courseNum2;

                    commonPairs.put( pair,common);
                }
            }
        } 

        return commonPairs;                  
    }

    public static List<String> commonElements(List<String> list1, List<String> list2){
        List<String> ans = new ArrayList<>();
        for(String st: list1){
            if(list2.contains(st)){
                ans.add(st);
            }
        }

        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
