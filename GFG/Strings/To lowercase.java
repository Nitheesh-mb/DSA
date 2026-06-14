
Kalaibharathi Perumal
5 months agoJan 08, 2026 08:10 (GMT +5:30)

class Solution {
    static String toLower(String s) {
        
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++){
            char ch=c[i];
            if(65<=ch&&90>=ch)
                c[i]=(char) (ch+32);
            
        }
                return new String(c);
    }
}