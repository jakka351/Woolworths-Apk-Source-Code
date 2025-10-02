package com.salesforce.marketingcloud.events.predicates;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension
/* loaded from: classes6.dex */
public final class e extends f {

    @NotNull
    private f[] e;

    public e(@NotNull f... predicates) {
        Intrinsics.h(predicates, "predicates");
        this.e = predicates;
    }

    @Override // com.salesforce.marketingcloud.events.predicates.f
    public boolean a() {
        for (f fVar : this.e) {
            if (fVar.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.salesforce.marketingcloud.events.predicates.f
    @NotNull
    public String c() {
        return "Or";
    }
}
