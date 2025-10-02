package kotlinx.serialization.json.internal;

import kotlin.DeepRecursiveScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.serialization.json.JsonElement;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlinx/serialization/json/JsonElement;", "Lkotlin/DeepRecursiveScope;", "", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", l = {115}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class JsonTreeReader$readDeepRecursive$1 extends RestrictedSuspendLambda implements Function3<DeepRecursiveScope<Unit, JsonElement>, Unit, Continuation<? super JsonElement>, Object> {
    public int q;
    public /* synthetic */ DeepRecursiveScope r;
    public final /* synthetic */ JsonTreeReader s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeReader$readDeepRecursive$1(JsonTreeReader jsonTreeReader, Continuation continuation) {
        super(3, continuation);
        this.s = jsonTreeReader;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$1 = new JsonTreeReader$readDeepRecursive$1(this.s, (Continuation) obj3);
        jsonTreeReader$readDeepRecursive$1.r = (DeepRecursiveScope) obj;
        return jsonTreeReader$readDeepRecursive$1.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        JsonTreeReader jsonTreeReader = this.s;
        AbstractJsonLexer abstractJsonLexer = jsonTreeReader.f24867a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            DeepRecursiveScope deepRecursiveScope = this.r;
            byte bY = abstractJsonLexer.y();
            if (bY == 1) {
                return jsonTreeReader.d(true);
            }
            if (bY == 0) {
                return jsonTreeReader.d(false);
            }
            if (bY != 6) {
                if (bY == 8) {
                    return jsonTreeReader.c();
                }
                AbstractJsonLexer.r(abstractJsonLexer, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.q = 1;
            obj = JsonTreeReader.a(jsonTreeReader, deepRecursiveScope, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return (JsonElement) obj;
    }
}
