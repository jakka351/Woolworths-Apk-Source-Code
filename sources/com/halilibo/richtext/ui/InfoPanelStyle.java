package com.halilibo.richtext.ui;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/halilibo/richtext/ui/InfoPanelStyle;", "", "Companion", "richtext-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class InfoPanelStyle {
    public static final InfoPanelStyle d = new InfoPanelStyle(null, null, null);

    /* renamed from: a, reason: collision with root package name */
    public final PaddingValues f16285a;
    public final Function3 b;
    public final Function3 c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/ui/InfoPanelStyle$Companion;", "", "richtext-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public InfoPanelStyle(PaddingValues paddingValues, Function3 function3, Function3 function32) {
        this.f16285a = paddingValues;
        this.b = function3;
        this.c = function32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoPanelStyle)) {
            return false;
        }
        InfoPanelStyle infoPanelStyle = (InfoPanelStyle) obj;
        return Intrinsics.c(this.f16285a, infoPanelStyle.f16285a) && Intrinsics.c(this.b, infoPanelStyle.b) && Intrinsics.c(this.c, infoPanelStyle.c);
    }

    public final int hashCode() {
        PaddingValues paddingValues = this.f16285a;
        int iHashCode = (paddingValues == null ? 0 : paddingValues.hashCode()) * 31;
        Function3 function3 = this.b;
        int iHashCode2 = (iHashCode + (function3 == null ? 0 : function3.hashCode())) * 31;
        Function3 function32 = this.c;
        return iHashCode2 + (function32 != null ? function32.hashCode() : 0);
    }

    public final String toString() {
        return "InfoPanelStyle(contentPadding=" + this.f16285a + ", background=" + this.b + ", textStyle=" + this.c + ")";
    }
}
