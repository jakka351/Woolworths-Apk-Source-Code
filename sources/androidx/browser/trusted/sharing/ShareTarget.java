package androidx.browser.trusted.sharing;

import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class ShareTarget {

    /* renamed from: a, reason: collision with root package name */
    public final String f220a;
    public final String b;
    public final String c;
    public final Params d;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface EncodingType {
    }

    public static final class FileFormField {

        /* renamed from: a, reason: collision with root package name */
        public final String f221a;
        public final List b;

        public FileFormField(String str, List list) {
            this.f221a = str;
            this.b = Collections.unmodifiableList(list);
        }
    }

    public static class Params {

        /* renamed from: a, reason: collision with root package name */
        public final String f222a;
        public final String b;
        public final List c;

        public Params(String str, String str2, ArrayList arrayList) {
            this.f222a = str;
            this.b = str2;
            this.c = arrayList;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface RequestMethod {
    }

    public ShareTarget(String str, String str2, String str3, Params params) {
        this.f220a = str;
        this.b = str2;
        this.c = str3;
        this.d = params;
    }
}
