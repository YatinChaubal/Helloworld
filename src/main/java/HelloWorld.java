import jep.Jep;
import jep.JepException;
//test
/**
 * Created by Yatin on 29/11/17.
 */public class HelloWorld {

    public static void main(String[] args) throws JepException {
        // Prints "Hello, World" to the terminal window.
        HelloWorld hw = new HelloWorld();
        String s1 = "\uD83D\uDE4F\uD83C\uDFFB\uD83D\uDE4F\uD83C\uDFFB\uD83D\uDE4F\uD83C\uDFFBवर्तमान प्रधानमंत्री मा. नरेन्द्र मोदी को देश की जनता का आक्रोश क्यो सहन करना पड रहा है जरा गौर करने जैसा है......*नया आधार लिंक कराने से महाराष्ट्र में 10 लाख गरीब गायब हो गए!**उत्तरखण्ड में भी कई लाख फ़र्ज़ी बीपीएल कार्ड धारी गरीब ख़त्म हो गए !**तीन करोड़ (30000000 ) से जायदा फ़र्ज़ी एलपीजी कनेक्शन धारक ख़त्म हो गए !**मदरसों से वज़ीफ़ा पाने वाले 1,95,000 फर्ज़ी बच्चे गायब हो गए!**डेढ़ करोड़ (15000000 ) से ऊपर फ़र्ज़ी राशन कार्ड धारी गायब हो गए!**ये सब क्यों और कहाँ गायब होते जा रहे हैं !**चोरो का सारा काला चिटठा खुलने वाला है …इसीलिए  सारे चोर ने मिलकर माननीय सर्वोच्च न्यायलय में याचिका दायर कर दी कि आधार लिंक हमारे मौलिक अधिकारों का हनन है ! चोरों  को  प्राइवेसीका कैसा अधिकार!**1) कंपनी के MD :मोदी ने फर्जी 3 लाख से ज्यादा कम्पनियां  बन्द कर दी है!**2) राशऩ डीलर नाराज़ हो गये!**3) Property Dealer नाराज़ हो गये!**4)ऑनलाइन सिस्टम बनने से दलाल नाराज़ हो गये है!**5) 40,000फर्जी NGO बन्द हो गये है, इसलिए इन  NGO के मालिक भी नाराज़ हो गये !**6) No 2 की Income से Property खरीद ने वाले नाराज़ हो गये!**7) E-Tender  होने से कुछ ठेकेदार भी नाराज़ हो गये!**8) गैस कंपनी वाले नाराज़ हो गये!**9)अबतक जो 12 करोड लोग  Income टैक्स के दायरे मै आ चुके हैं वह लोग नाराज़ हो गये!**10) GST सिस्टम लागू होने से ब्यापारी लोग नाराज़ हो गये, क्योकि वो लोग Automatic सिस्टम मै आ गये है!**11) वो 2 नम्बर  के काम बाले लोग फलना फूलना बन्द हो गये है!**13) Black को White करने का सिस्टम एक दम से लुंज सा हो गया है।**14) आलसी सरकरी अधिकारी नाराज हो गये, क्योकि समय पर जाकर काम करना पड रहा हैं!**15) वो लोग नाराज हो गये, जो समय पर काम नही करते थे औररिश्वत देकर काम करने मे विश्वास  करते है।**दुख होना लाज़मी है देश बदलाव की कहानी लिखी जा रही है,  जिसे समझ आ रही है बदल रहा है जिसे नही आ रही है वो  मंदबुध्दि युवराज के #मानसिक_गुलाम हमे अंधभक्त कह कह कर छाती कूट रहे है!*💥 *अगर\"देश केलिए\"कुछ करना है, तो यह सन्देश -30 लोगों को भेजना है।*💥 *बस - आपको तो एक कड़ी जोड़नी है, देखते ही देखते,\"पूरा देश\" जुड़ जायेगा।!!*💥 *बस...जरासा forwards..करो.सिफॅ 2-3 सेकंड ही लगेंगे...**";
        String s= hw.PygetarticleLang(s1);
        System.out.println(s);
    }

    private String PygetarticleLang(String articleText) throws JepException {

        //Logs.ApplicationLogs.addLogs("info",articleText);
        EmojiEraser ee = new EmojiEraser();
        articleText = ee.eraseEmojis(articleText);




        try {
            Jep objJep = new Jep();
            objJep.eval("import langdetect");
            String s1 = "articleText=" + "\"" + articleText + "\"";
            objJep.eval(s1);
            s1 = "articleText=articleText.decode(\"utf-8\")";
            objJep.eval(s1);
            objJep.eval("res = langdetect.detect(articleText)");
            Object s = objJep.getValue("res");
            String op = (String) s;
            return op;
        } catch (Exception err) {
            return "UN";
        }


    }

}