package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class PropertyMetadata implements Serializable {
    public static final PropertyMetadata k = new PropertyMetadata(Boolean.TRUE, null, null, null, null, null, null);
    public static final PropertyMetadata l = new PropertyMetadata(Boolean.FALSE, null, null, null, null, null, null);
    public static final PropertyMetadata m = new PropertyMetadata(null, null, null, null, null, null, null);
    public final Boolean d;
    public final String e;
    public final Integer f;
    public final String g;
    public final transient MergeInfo h;
    public final Nulls i;
    public final Nulls j;

    public static final class MergeInfo {

        /* renamed from: a, reason: collision with root package name */
        public final AnnotatedMember f14231a;
        public final boolean b;

        public MergeInfo(AnnotatedMember annotatedMember, boolean z) {
            this.f14231a = annotatedMember;
            this.b = z;
        }
    }

    public PropertyMetadata(Boolean bool, String str, Integer num, String str2, MergeInfo mergeInfo, Nulls nulls, Nulls nulls2) {
        this.d = bool;
        this.e = str;
        this.f = num;
        this.g = (str2 == null || str2.isEmpty()) ? null : str2;
        this.h = mergeInfo;
        this.i = nulls;
        this.j = nulls2;
    }

    public static PropertyMetadata a(Boolean bool, String str, Integer num, String str2) {
        return (str == null && num == null && str2 == null) ? bool == null ? m : bool.booleanValue() ? k : l : new PropertyMetadata(bool, str, num, str2, null, null, null);
    }

    public final PropertyMetadata b(MergeInfo mergeInfo) {
        return new PropertyMetadata(this.d, this.e, this.f, this.g, mergeInfo, this.i, this.j);
    }

    public Object readResolve() {
        if (this.e != null || this.f != null || this.g != null || this.h != null || this.i != null || this.j != null) {
            return this;
        }
        Boolean bool = this.d;
        return bool == null ? m : bool.booleanValue() ? k : l;
    }
}
