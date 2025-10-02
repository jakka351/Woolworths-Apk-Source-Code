package com.apollographql.apollo.api;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/apollographql/apollo/api/Error;", "", "Builder", "Location", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Error {

    /* renamed from: a, reason: collision with root package name */
    public final String f13514a;
    public final List b;
    public final List c;
    public final Map d;
    public final Map e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/api/Error$Builder;", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/api/Error$Location;", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Location {

        /* renamed from: a, reason: collision with root package name */
        public final int f13515a;
        public final int b;

        public Location(int i, int i2) {
            this.f13515a = i;
            this.b = i2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Location(line = ");
            sb.append(this.f13515a);
            sb.append(", column = ");
            return YU.a.l(sb, this.b, ')');
        }
    }

    public Error(String str, List list, List list2, Map map, LinkedHashMap linkedHashMap) {
        this.f13514a = str;
        this.b = list;
        this.c = list2;
        this.d = map;
        this.e = linkedHashMap;
    }

    /* renamed from: a, reason: from getter */
    public final Map getD() {
        return this.d;
    }

    /* renamed from: b, reason: from getter */
    public final String getF13514a() {
        return this.f13514a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(message = ");
        sb.append(this.f13514a);
        sb.append(", locations = ");
        sb.append(this.b);
        sb.append(", path=");
        sb.append(this.c);
        sb.append(", extensions = ");
        sb.append(this.d);
        sb.append(", nonStandardFields = ");
        return android.support.v4.media.session.a.u(sb, this.e, ')');
    }
}
