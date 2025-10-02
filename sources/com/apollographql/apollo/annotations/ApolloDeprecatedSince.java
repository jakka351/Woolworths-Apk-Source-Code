package com.apollographql.apollo.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.MustBeDocumented;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@ApolloInternal
@kotlin.annotation.Target
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention
@MustBeDocumented
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/apollographql/apollo/annotations/ApolloDeprecatedSince;", "", "Lcom/apollographql/apollo/annotations/ApolloDeprecatedSince$Version;", "version", "<init>", "(Lcom/apollographql/apollo/annotations/ApolloDeprecatedSince$Version;)V", "Version", "apollo-annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Documented
/* loaded from: classes4.dex */
public @interface ApolloDeprecatedSince {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @ApolloInternal
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/annotations/ApolloDeprecatedSince$Version;", "", "apollo-annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Version {
        public static final /* synthetic */ Version[] d;
        public static final /* synthetic */ EnumEntries e;

        static {
            Version[] versionArr = {new Version("v3_0_0", 0), new Version("v3_0_1", 1), new Version("v3_1_1", 2), new Version("v3_2_1", 3), new Version("v3_2_2", 4), new Version("v3_2_3", 5), new Version("v3_3_1", 6), new Version("v3_3_2", 7), new Version("v3_3_3", 8), new Version("v3_4_1", 9), new Version("v3_5_1", 10), new Version("v3_6_3", 11), new Version("v3_7_2", 12), new Version("v3_7_5", 13), new Version("v4_0_0", 14), new Version("v4_0_1", 15), new Version("v4_0_2", 16), new Version("v4_1_2", 17)};
            d = versionArr;
            e = EnumEntriesKt.a(versionArr);
        }

        public static Version valueOf(String str) {
            return (Version) Enum.valueOf(Version.class, str);
        }

        public static Version[] values() {
            return (Version[]) d.clone();
        }
    }
}
