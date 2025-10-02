package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.PropertyReference0Impl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0 implements ColorProducer, FunctionAdapter {
    public final /* synthetic */ PropertyReference0Impl d;

    public TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0(PropertyReference0Impl propertyReference0Impl) {
        this.d = propertyReference0Impl;
    }

    @Override // androidx.compose.ui.graphics.ColorProducer
    public final /* synthetic */ long a() {
        return ((Color) this.d.invoke()).f1766a;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ColorProducer) || !(obj instanceof FunctionAdapter)) {
            return false;
        }
        return this.d.equals(((FunctionAdapter) obj).b());
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
