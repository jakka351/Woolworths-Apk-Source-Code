package com.scandit.datacapture.core.common.geometry;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0016\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/core/common/geometry/Size2;", "", "toJson", "", "width", "height", "Size2", "scandit-capture-core"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class Size2UtilsKt {
    @NotNull
    public static final Size2 Size2(int i, int i2) {
        return new Size2(i, i2);
    }

    public static final String toJson(Size2 size2) {
        Intrinsics.h(size2, "<this>");
        String string = new JSONObject(MapsKt.j(new Pair("width", Float.valueOf(size2.width)), new Pair("height", Float.valueOf(size2.height)))).toString();
        Intrinsics.g(string, "JSONObject(\n        mapO…       )\n    ).toString()");
        return string;
    }
}
