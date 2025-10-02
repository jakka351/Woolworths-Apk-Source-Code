package kotlinx.serialization.json.internal;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.DeepRecursiveFunction;
import kotlin.Function3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/JsonTreeReader;", "", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class JsonTreeReader {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractJsonLexer f24867a;
    public final boolean b;
    public int c;

    public JsonTreeReader(JsonConfiguration jsonConfiguration, AbstractJsonLexer abstractJsonLexer) {
        this.f24867a = abstractJsonLexer;
        this.b = jsonConfiguration.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(kotlinx.serialization.json.internal.JsonTreeReader r10, kotlin.DeepRecursiveScope r11, kotlin.coroutines.jvm.internal.BaseContinuationImpl r12) {
        /*
            kotlinx.serialization.json.internal.AbstractJsonLexer r0 = r10.f24867a
            boolean r1 = r12 instanceof kotlinx.serialization.json.internal.JsonTreeReader$readObject$2
            if (r1 == 0) goto L15
            r1 = r12
            kotlinx.serialization.json.internal.JsonTreeReader$readObject$2 r1 = (kotlinx.serialization.json.internal.JsonTreeReader$readObject$2) r1
            int r2 = r1.v
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.v = r2
            goto L1a
        L15:
            kotlinx.serialization.json.internal.JsonTreeReader$readObject$2 r1 = new kotlinx.serialization.json.internal.JsonTreeReader$readObject$2
            r1.<init>(r10, r12)
        L1a:
            java.lang.Object r12 = r1.t
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r1.v
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 7
            r8 = 4
            r9 = 1
            if (r3 == 0) goto L5a
            if (r3 != r9) goto L52
            java.lang.String r10 = r1.s
            java.util.LinkedHashMap r11 = r1.r
            kotlinx.serialization.json.internal.JsonTreeReader r0 = r1.q
            kotlin.DeepRecursiveScope r3 = r1.p
            kotlin.ResultKt.b(r12)
            kotlinx.serialization.json.JsonElement r12 = (kotlinx.serialization.json.JsonElement) r12
            r11.put(r10, r12)
            kotlinx.serialization.json.internal.AbstractJsonLexer r10 = r0.f24867a
            byte r10 = r10.f()
            if (r10 == r8) goto L4d
            if (r10 != r7) goto L45
            goto L96
        L45:
            kotlinx.serialization.json.internal.AbstractJsonLexer r10 = r0.f24867a
            java.lang.String r11 = "Expected end of the object or comma"
            kotlinx.serialization.json.internal.AbstractJsonLexer.r(r10, r11, r4, r5, r6)
            throw r5
        L4d:
            r12 = r10
            r10 = r0
            r0 = r11
            r11 = r3
            goto L6c
        L52:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L5a:
            kotlin.ResultKt.b(r12)
            byte r12 = r0.g(r6)
            byte r3 = r0.y()
            if (r3 == r8) goto Lac
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
        L6c:
            kotlinx.serialization.json.internal.AbstractJsonLexer r3 = r10.f24867a
            boolean r4 = r3.c()
            if (r4 == 0) goto L93
            boolean r12 = r10.b
            if (r12 == 0) goto L7d
            java.lang.String r12 = r3.l()
            goto L81
        L7d:
            java.lang.String r12 = r3.j()
        L81:
            r4 = 5
            r3.g(r4)
            r1.p = r11
            r1.q = r10
            r1.r = r0
            r1.s = r12
            r1.v = r9
            r11.a(r1)
            return r2
        L93:
            r11 = r0
            r0 = r10
            r10 = r12
        L96:
            kotlinx.serialization.json.internal.AbstractJsonLexer r12 = r0.f24867a
            if (r10 != r6) goto L9e
            r12.g(r7)
            goto La0
        L9e:
            if (r10 == r8) goto La6
        La0:
            kotlinx.serialization.json.JsonObject r10 = new kotlinx.serialization.json.JsonObject
            r10.<init>(r11)
            return r10
        La6:
            java.lang.String r10 = "object"
            kotlinx.serialization.json.internal.JsonExceptionsKt.e(r12, r10)
            throw r5
        Lac:
            java.lang.String r10 = "Unexpected leading comma"
            kotlinx.serialization.json.internal.AbstractJsonLexer.r(r0, r10, r4, r5, r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.JsonTreeReader.a(kotlinx.serialization.json.internal.JsonTreeReader, kotlin.DeepRecursiveScope, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    public final JsonElement b() {
        JsonElement jsonObject;
        AbstractJsonLexer abstractJsonLexer = this.f24867a;
        byte bY = abstractJsonLexer.y();
        if (bY == 1) {
            return d(true);
        }
        if (bY == 0) {
            return d(false);
        }
        if (bY != 6) {
            if (bY == 8) {
                return c();
            }
            AbstractJsonLexer.r(abstractJsonLexer, "Cannot read Json element because of unexpected ".concat(AbstractJsonLexerKt.b(bY)), 0, null, 6);
            throw null;
        }
        int i = this.c + 1;
        this.c = i;
        if (i == 200) {
            jsonObject = (JsonElement) Function3.a(new DeepRecursiveFunction(new JsonTreeReader$readDeepRecursive$1(this, null)));
        } else {
            byte bG = abstractJsonLexer.g((byte) 6);
            if (abstractJsonLexer.y() == 4) {
                AbstractJsonLexer.r(abstractJsonLexer, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!abstractJsonLexer.c()) {
                    break;
                }
                String strL = this.b ? abstractJsonLexer.l() : abstractJsonLexer.j();
                abstractJsonLexer.g((byte) 5);
                linkedHashMap.put(strL, b());
                bG = abstractJsonLexer.f();
                if (bG != 4) {
                    if (bG != 7) {
                        AbstractJsonLexer.r(abstractJsonLexer, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (bG == 6) {
                abstractJsonLexer.g((byte) 7);
            } else if (bG == 4) {
                JsonExceptionsKt.e(abstractJsonLexer, "object");
                throw null;
            }
            jsonObject = new JsonObject(linkedHashMap);
        }
        this.c--;
        return jsonObject;
    }

    public final JsonArray c() {
        AbstractJsonLexer abstractJsonLexer = this.f24867a;
        byte bF = abstractJsonLexer.f();
        if (abstractJsonLexer.y() == 4) {
            AbstractJsonLexer.r(abstractJsonLexer, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (abstractJsonLexer.c()) {
            arrayList.add(b());
            bF = abstractJsonLexer.f();
            if (bF != 4) {
                boolean z = bF == 9;
                int i = abstractJsonLexer.f24849a;
                if (!z) {
                    AbstractJsonLexer.r(abstractJsonLexer, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (bF == 8) {
            abstractJsonLexer.g((byte) 9);
        } else if (bF == 4) {
            JsonExceptionsKt.e(abstractJsonLexer, "array");
            throw null;
        }
        return new JsonArray(arrayList);
    }

    public final JsonPrimitive d(boolean z) {
        boolean z2 = this.b;
        AbstractJsonLexer abstractJsonLexer = this.f24867a;
        String strL = (z2 || !z) ? abstractJsonLexer.l() : abstractJsonLexer.j();
        return (z || !Intrinsics.c(strL, "null")) ? new JsonLiteral(strL, z, null) : JsonNull.INSTANCE;
    }
}
