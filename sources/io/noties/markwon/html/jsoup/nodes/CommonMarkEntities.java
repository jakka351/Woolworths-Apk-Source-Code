package io.noties.markwon.html.jsoup.nodes;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Map;
import org.commonmark.internal.util.Html5Entities;

/* loaded from: classes7.dex */
public abstract class CommonMarkEntities {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f24209a;

    static {
        Map map;
        try {
            Field declaredField = Html5Entities.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            map = (Map) declaredField.get(null);
        } catch (Throwable th) {
            Map map2 = Collections.EMPTY_MAP;
            th.printStackTrace();
            map = map2;
        }
        f24209a = map;
    }
}
