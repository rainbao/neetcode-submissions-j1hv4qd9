class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> part = new ArrayList<>();
        partit(s, res, part, 0);
        return res;
    }

    private void partit(String s, List<List<String>> res, List<String> part, int i){
        if(i >= s.length()){
            res.add(new ArrayList<>(part));
            return;
        }

        for(int j = i; j < s.length(); j++){
            if(isPali(s, i, j)){
                part.add(s.substring(i, j + 1));
                partit(s, res, part, j + 1);
                part.remove(part.size() - 1);
            }
        }
    }


    private boolean isPali(String s, int l, int r){
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
