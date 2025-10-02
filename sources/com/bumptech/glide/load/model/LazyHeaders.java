package com.bumptech.glide.load.model;

import YU.a;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class LazyHeaders implements Headers {
    public final Map b;
    public volatile Map c;

    public static final class Builder {
        public static final Map c;

        /* renamed from: a, reason: collision with root package name */
        public boolean f13856a = true;
        public Map b = c;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb = new StringBuilder(property.length());
                for (int i = 0; i < length; i++) {
                    char cCharAt = property.charAt(i);
                    if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                        sb.append(cCharAt);
                    } else {
                        sb.append('?');
                    }
                }
                property = sb.toString();
            }
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                map.put("User-Agent", Collections.singletonList(new StringHeaderFactory(property)));
            }
            c = Collections.unmodifiableMap(map);
        }

        public final void a() {
            StringHeaderFactory stringHeaderFactory = new StringHeaderFactory("QmL~:n6y!Em?8f2F");
            if (this.f13856a) {
                this.f13856a = false;
                HashMap map = new HashMap(this.b.size());
                for (Map.Entry entry : this.b.entrySet()) {
                    map.put(entry.getKey(), new ArrayList((Collection) entry.getValue()));
                }
                this.b = map;
            }
            List arrayList = (List) this.b.get("uat-assets-access");
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.b.put("uat-assets-access", arrayList);
            }
            arrayList.add(stringHeaderFactory);
        }
    }

    public static final class StringHeaderFactory implements LazyHeaderFactory {

        /* renamed from: a, reason: collision with root package name */
        public final String f13857a;

        public StringHeaderFactory(String str) {
            this.f13857a = str;
        }

        @Override // com.bumptech.glide.load.model.LazyHeaderFactory
        public final String a() {
            return this.f13857a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof StringHeaderFactory) {
                return this.f13857a.equals(((StringHeaderFactory) obj).f13857a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f13857a.hashCode();
        }

        public final String toString() {
            return a.o(new StringBuilder("StringHeaderFactory{value='"), this.f13857a, "'}");
        }
    }

    public LazyHeaders(Map map) {
        this.b = Collections.unmodifiableMap(map);
    }

    @Override // com.bumptech.glide.load.model.Headers
    public final Map a() {
        if (this.c == null) {
            synchronized (this) {
                try {
                    if (this.c == null) {
                        this.c = Collections.unmodifiableMap(b());
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    public final HashMap b() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.b.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String strA = ((LazyHeaderFactory) list.get(i)).a();
                if (!TextUtils.isEmpty(strA)) {
                    sb.append(strA);
                    if (i != list.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String string = sb.toString();
            if (!TextUtils.isEmpty(string)) {
                map.put(entry.getKey(), string);
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LazyHeaders) {
            return this.b.equals(((LazyHeaders) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return android.support.v4.media.session.a.u(new StringBuilder("LazyHeaders{headers="), this.b, '}');
    }
}
