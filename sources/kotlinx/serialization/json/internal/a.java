package kotlinx.serialization.json.internal;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                AbstractJsonTreeEncoder abstractJsonTreeEncoder = (AbstractJsonTreeEncoder) this.e;
                JsonElement node = (JsonElement) obj;
                Intrinsics.h(node, "node");
                abstractJsonTreeEncoder.a0((String) CollectionsKt.O(abstractJsonTreeEncoder.f24823a), node);
                break;
            default:
                Ref.ObjectRef objectRef = (Ref.ObjectRef) this.e;
                JsonElement it = (JsonElement) obj;
                Intrinsics.h(it, "it");
                objectRef.d = it;
                break;
        }
        return Unit.f24250a;
    }
}
