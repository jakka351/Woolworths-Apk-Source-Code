package com.apollographql.apollo.api;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/apollographql/apollo/api/BooleanExpression;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "True", "False", "Not", "Or", "And", "Element", "Lcom/apollographql/apollo/api/BooleanExpression$And;", "Lcom/apollographql/apollo/api/BooleanExpression$Element;", "Lcom/apollographql/apollo/api/BooleanExpression$False;", "Lcom/apollographql/apollo/api/BooleanExpression$Not;", "Lcom/apollographql/apollo/api/BooleanExpression$Or;", "Lcom/apollographql/apollo/api/BooleanExpression$True;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class BooleanExpression<T> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Lcom/apollographql/apollo/api/BooleanExpression$And;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/apollographql/apollo/api/BooleanExpression;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final /* data */ class And<T> extends BooleanExpression<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Set f13498a;

        public And(Set set) {
            this.f13498a = set;
            if (set.isEmpty()) {
                throw new IllegalStateException("Apollo: cannot create a 'And' condition from an empty list");
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof And) && Intrinsics.c(this.f13498a, ((And) obj).f13498a);
        }

        public final int hashCode() {
            return this.f13498a.hashCode();
        }

        public final String toString() {
            return "And(operands=" + this.f13498a + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\n\b\u0001\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Lcom/apollographql/apollo/api/BooleanExpression$Element;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/apollographql/apollo/api/BooleanExpression;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Element<T> extends BooleanExpression<T> {

        /* renamed from: a, reason: collision with root package name */
        public final BTerm f13499a;

        public Element(BTerm bTerm) {
            this.f13499a = bTerm;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Element) && this.f13499a.equals(((Element) obj).f13499a);
        }

        public final int hashCode() {
            return this.f13499a.hashCode();
        }

        public final String toString() {
            return "Element(value=" + this.f13499a + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/api/BooleanExpression$False;", "Lcom/apollographql/apollo/api/BooleanExpression;", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class False extends BooleanExpression {

        /* renamed from: a, reason: collision with root package name */
        public static final False f13500a = new False();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\n\b\u0001\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Lcom/apollographql/apollo/api/BooleanExpression$Not;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/apollographql/apollo/api/BooleanExpression;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Not<T> extends BooleanExpression<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Element f13501a;

        public Not(Element element) {
            this.f13501a = element;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Not) && this.f13501a.equals(((Not) obj).f13501a);
        }

        public final int hashCode() {
            return this.f13501a.hashCode();
        }

        public final String toString() {
            return "Not(operand=" + this.f13501a + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Lcom/apollographql/apollo/api/BooleanExpression$Or;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/apollographql/apollo/api/BooleanExpression;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Or<T> extends BooleanExpression<T> {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Or);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            CollectionsKt.M(null, " | ", null, null, null, 62);
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/api/BooleanExpression$True;", "Lcom/apollographql/apollo/api/BooleanExpression;", "", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class True extends BooleanExpression {

        /* renamed from: a, reason: collision with root package name */
        public static final True f13502a = new True();
    }
}
