package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/JsonConfiguration;", "", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class JsonConfiguration {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f24840a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final ClassDiscriminatorMode i;

    public JsonConfiguration(boolean z, boolean z2, boolean z3, String prettyPrintIndent, boolean z4, String classDiscriminator, boolean z5, boolean z6, ClassDiscriminatorMode classDiscriminatorMode) {
        Intrinsics.h(prettyPrintIndent, "prettyPrintIndent");
        Intrinsics.h(classDiscriminator, "classDiscriminator");
        Intrinsics.h(classDiscriminatorMode, "classDiscriminatorMode");
        this.f24840a = z;
        this.b = z2;
        this.c = z3;
        this.d = prettyPrintIndent;
        this.e = z4;
        this.f = classDiscriminator;
        this.g = z5;
        this.h = z6;
        this.i = classDiscriminatorMode;
    }

    public final String toString() {
        return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=" + this.f24840a + ", isLenient=" + this.b + ", allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.c + ", prettyPrintIndent='" + this.d + "', coerceInputValues=" + this.e + ", useArrayPolymorphism=false, classDiscriminator='" + this.f + "', allowSpecialFloatingPointValues=" + this.g + ", useAlternativeNames=" + this.h + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + this.i + ')';
    }
}
