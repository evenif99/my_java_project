package ch04_class;

public class SmartphoneMain02 {
    public static void main(String[] args) {
        Smartphone02[] smartphone = new Smartphone02[2];

        smartphone[0] = new Smartphone02("갤럭시 S25 Edge", "퀄컴 스냅드래곤 8 Elite for Galaxy Mobile Platform", "12 GB LPDDR5X SDRAM 9,600 MT/s + 256 / 512 GB UFS 4.0 내장 메모리", "6.7인치 (169.1 mm)[1] 19.5:9 비율 3120 × 1440 Dynamic AMOLED 2X Infinity-O Display", "전면 듀얼 픽셀 PDAF 지원 1,200만 화소 (ƒ/2.2 & 80°)", "내장형 Li-Ion 3,900 mAh", "티타늄 제트블랙, 티타늄 아이스블루, 티타늄 실버");

        smartphone[1] = new Smartphone02("갤럭시 S24 Ultra", "퀄컴 스냅드래곤 8 Gen 3 for Galaxy Mobile Platform", "12 GB LPDDR5X SDRAM 9,600 MT/s + 256 / 512 GB UFS 4.0 내장 메모리", "6.8인치 (172.5 mm)[6] 19.5:9 비율 3120 × 1440 Dynamic AMOLED 2X Infinity-O Display", "전면 듀얼 픽셀 PDAF 지원 1,200만 화소 (ƒ/2.2 & 80°)", "티타늄 블랙, 티타늄 옐로우, 티타늄 그레이, 티타늄 바이올렛, 티타늄 오렌지, 티타늄 블루, 티타늄 그린");

        for (int i = 0; i < smartphone.length; i++) {
            smartphone[i].display();
        }
        // 배열 안쪽 초기화 기법
        Smartphone02[] phonelist = {
                new Smartphone02("갤럭시 S25 Edge", "퀄컴 스냅드래곤 8 Elite for Galaxy Mobile Platform", "12 GB LPDDR5X SDRAM 9,600 MT/s + 256 / 512 GB UFS 4.0 내장 메모리", "6.7인치 (169.1 mm)[1] 19.5:9 비율 3120 × 1440 Dynamic AMOLED 2X Infinity-O Display", "전면 듀얼 픽셀 PDAF 지원 1,200만 화소 (ƒ/2.2 & 80°)", "내장형 Li-Ion 3,900 mAh", "티타늄 제트블랙, 티타늄 아이스블루, 티타늄 실버"),
                new Smartphone02("갤럭시 S24 Ultra", "퀄컴 스냅드래곤 8 Gen 3 for Galaxy Mobile Platform", "12 GB LPDDR5X SDRAM 9,600 MT/s + 256 / 512 GB UFS 4.0 내장 메모리", "6.8인치 (172.5 mm)[6] 19.5:9 비율 3120 × 1440 Dynamic AMOLED 2X Infinity-O Display", "전면 듀얼 픽셀 PDAF 지원 1,200만 화소 (ƒ/2.2 & 80°)", "티타늄 블랙, 티타늄 옐로우, 티타늄 그레이, 티타늄 바이올렛, 티타늄 오렌지, 티타늄 블루, 티타늄 그린")
        };
        for (int i = 0; i < phonelist.length; i++) {
            phonelist[i].display();
        }
    }
}
