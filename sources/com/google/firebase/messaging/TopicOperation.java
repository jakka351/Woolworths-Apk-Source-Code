package com.google.firebase.messaging;

import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class TopicOperation {
    public static final Pattern d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    public final String f15654a;
    public final String b;
    public final String c;

    public TopicOperation(String str, String str2) {
        String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !d.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(YU.a.h("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.f15654a = strSubstring;
        this.b = str;
        this.c = androidx.camera.core.impl.b.o(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TopicOperation)) {
            return false;
        }
        TopicOperation topicOperation = (TopicOperation) obj;
        return this.f15654a.equals(topicOperation.f15654a) && this.b.equals(topicOperation.b);
    }

    public final int hashCode() {
        return Objects.hashCode(this.b, this.f15654a);
    }
}
