package com.airbnb.lottie.compose;

import YU.a;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "", "Asset", "ContentProvider", "File", "JsonString", "RawRes", "Url", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$Asset;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$ContentProvider;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$File;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$JsonString;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$RawRes;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$Url;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface LottieCompositionSpec {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$Asset;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "assetName", "", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class Asset implements LottieCompositionSpec {

        /* renamed from: a, reason: collision with root package name */
        public final String f13377a;

        public final boolean equals(Object obj) {
            if (obj instanceof Asset) {
                return Intrinsics.c(this.f13377a, ((Asset) obj).f13377a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f13377a.hashCode();
        }

        public final String toString() {
            return a.h("Asset(assetName=", this.f13377a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$ContentProvider;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "uri", "Landroid/net/Uri;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class ContentProvider implements LottieCompositionSpec {
        public final boolean equals(Object obj) {
            return (obj instanceof ContentProvider) && Intrinsics.c(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "ContentProvider(uri=null)";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$File;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "fileName", "", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class File implements LottieCompositionSpec {
        public final boolean equals(Object obj) {
            return (obj instanceof File) && Intrinsics.c(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "File(fileName=null)";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$JsonString;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "jsonString", "", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class JsonString implements LottieCompositionSpec {
        public final boolean equals(Object obj) {
            return (obj instanceof JsonString) && Intrinsics.c(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "JsonString(jsonString=null)";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$RawRes;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "resId", "", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class RawRes implements LottieCompositionSpec {

        /* renamed from: a, reason: collision with root package name */
        public final int f13378a;

        public final boolean equals(Object obj) {
            if (obj instanceof RawRes) {
                return this.f13378a == ((RawRes) obj).f13378a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f13378a);
        }

        public final String toString() {
            return a.e(this.f13378a, "RawRes(resId=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$Url;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "url", "", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class Url implements LottieCompositionSpec {

        /* renamed from: a, reason: collision with root package name */
        public final String f13379a;

        public final boolean equals(Object obj) {
            if (obj instanceof Url) {
                return Intrinsics.c(this.f13379a, ((Url) obj).f13379a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f13379a.hashCode();
        }

        public final String toString() {
            return a.h("Url(url=", this.f13379a, ")");
        }
    }
}
