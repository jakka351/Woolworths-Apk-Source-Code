package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnlllnn;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class jjxxjjj {
    private static final int q0071qqq00710071 = 1000;
    private static final Hashtable<String, Long> qqqqq00710071 = new Hashtable<>();
    private static final jjxxjjj qq0071qq00710071 = new jjxxjjj();

    private jjxxjjj() {
    }

    public static void w0077w0077w00770077w() {
        qqqqq00710071.clear();
    }

    public static jjxxjjj ww0077ww00770077w() {
        return qq0071qq00710071;
    }

    @Nullable
    public static String www0077w00770077w(long j) {
        long jF0066fff00660066 = nnlllnn.nlnnnnl.f0066fff00660066() - j;
        ArrayList arrayList = new ArrayList(qqqqq00710071.entrySet());
        Collections.sort(arrayList, new Comparator<Map.Entry<String, Long>>() { // from class: com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjxxjjj.1
            @Override // java.util.Comparator
            public int compare(Map.Entry<String, Long> entry, Map.Entry<String, Long> entry2) {
                return entry2.getValue().compareTo(entry.getValue());
            }
        });
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        StringBuilder sb = new StringBuilder();
        sb.append("tt:" + decimalFormat.format(jF0066fff00660066 / 1000.0d) + ";");
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(String.format("%s:%s;", entry.getKey(), decimalFormat.format(((Long) entry.getValue()).doubleValue() / 1000.0d)));
            i++;
            if (i >= 10) {
                break;
            }
        }
        return sb.toString();
    }

    public Boolean w00770077ww00770077w() {
        return Boolean.valueOf(qqqqq00710071.isEmpty());
    }

    public synchronized void w0077www00770077w(@Nonnull String str, Long l) {
        try {
            Hashtable<String, Long> hashtable = qqqqq00710071;
            Long l2 = hashtable.get(str);
            if (l2 != null) {
                l = Long.valueOf(l2.longValue() + l.longValue());
            }
            hashtable.put(str, l);
        } catch (Throwable th) {
            throw th;
        }
    }
}
