package com.fasterxml.jackson.core.util;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class InternCache extends ConcurrentHashMap<String, String> {
    public static final InternCache e = new InternCache();
    public final Object d;

    public InternCache() {
        super(SubsamplingScaleImageView.ORIENTATION_180, 0.8f, 4);
        this.d = new Object();
    }

    public final String a(String str) {
        String str2 = get(str);
        if (str2 != null) {
            return str2;
        }
        if (size() >= 180) {
            synchronized (this.d) {
                try {
                    if (size() >= 180) {
                        clear();
                    }
                } finally {
                }
            }
        }
        String strIntern = str.intern();
        put(strIntern, strIntern);
        return strIntern;
    }
}
