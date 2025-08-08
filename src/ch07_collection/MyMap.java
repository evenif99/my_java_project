package ch07_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap {
    public static void main(String[] args) {
        Map<String, Integer> teamMap = new HashMap<String, Integer>();

        teamMap.put("LG", 1);
        teamMap.put("SSG", 2);
        teamMap.put("두산", 3);
        teamMap.put("KT", 4);

        String findeItem = "nc";
        boolean bool = teamMap.containsKey(findeItem);
        System.out.println(findeItem + " 팀이 목록에 있나요?" + bool);

        // 'nc' 팀이 존재하는 지 체크하고, 없으면 순위 5위로 추가해 주세요
        if (teamMap.containsKey(findeItem) == false) {
            teamMap.put(findeItem, 5);
        }

        // 순위가 6위인 팀이 존재하는지 체크하고, 존재하지 않으면 'KIA'를 추가해 주세요.
        // 그리고, 존재 여부를 적절한 문구로 출력해 주세요
        final int pos = 6;
        String findteam = "KIA";
        if (teamMap.containsValue(pos) == true) {
            System.out.println(pos + "위 팀은 존재합니다.");
        } else {
            System.out.println(pos + "위 팀은 존재하지 않아서 추가합니다.");
            teamMap.put(findteam, pos);
        }

        String[] teams = {"롯데", "한화", "키움", "삼성"};
        for (int i = 0; i < teams.length; i++) {
            teamMap.put(teams[i], i + 7);
        }

        findeItem = "한화";
        Integer rank = teamMap.get(findeItem);

        if (rank == null) {
            System.out.println(findeItem + "팀은 존재하지 않습니다");
        } else {
            String message = "팀명 : " + findeItem + ", 순위 : " + rank;
            System.out.println(message);
        }

        System.out.println("다음 팀들의 순위 정보를 출력해 주세요.");
        String[] findTeams = {"두산", "KT", "빙그레"};

        for (String one : findTeams) {
            rank = teamMap.get(one);

            if (rank != null) {
                String message = "팀명 : " + findeItem + ", 순위 : " + rank;
                System.out.println(message);
            } else {
                System.out.println(one + "팀이 존재하지 않아서 추가합니다.");
                teamMap.put(one, 11);
            }
        }

        System.out.println("전체 목록을 출력해 봅니다.");
        Set<String> items = teamMap.keySet();

        for(String key:items){
            String message = key + " 팀은 순위가 " + teamMap.get(key) + "위입니다.";
            System.out.println(message);
        }

        System.out.println("요소 크기 : " + teamMap.size());
        System.out.println(teamMap.toString()); // teamMap이 객체이기 때문에 'to String'을 오버라이딩 한다

        teamMap.clear();

        teamMap.

        if (teamMap.isEmpty()){ // 메소드에 be동사가 나오게 된다면 boolean 타입이다
            System.out.println("teamMap is empty");
        }else {
            System.out.println("teamMap is not empty");
        }
    }
}
