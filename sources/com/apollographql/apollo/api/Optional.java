package com.apollographql.apollo.api;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/apollographql/apollo/api/Optional;", "V", "", "Present", "Absent", "Companion", "Lcom/apollographql/apollo/api/Optional$Absent;", "Lcom/apollographql/apollo/api/Optional$Present;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class Optional<V> {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/api/Optional$Absent;", "Lcom/apollographql/apollo/api/Optional;", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Absent extends Optional {

        /* renamed from: a, reason: collision with root package name */
        public static final Absent f13523a = new Absent();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/api/Optional$Companion;", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static Optional a(Object obj) {
            return obj == null ? Absent.f13523a : new Present(obj);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/api/Optional$Present;", "V", "Lcom/apollographql/apollo/api/Optional;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Present<V> extends Optional<V> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f13524a;

        public Present(Object obj) {
            this.f13524a = obj;
        }

        /* renamed from: a, reason: from getter */
        public final Object getF13524a() {
            return this.f13524a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Present) && Intrinsics.c(this.f13524a, ((Present) obj).f13524a);
        }

        public final int hashCode() {
            Object obj = this.f13524a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return android.support.v4.media.session.a.s(new StringBuilder("Present(value="), this.f13524a, ')');
        }
    }
}
