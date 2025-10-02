package androidx.compose.ui.graphics;

import android.graphics.Shader;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/graphics/BrushKt$ShaderBrush$1", "Landroidx/compose/ui/graphics/ShaderBrush;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BrushKt$ShaderBrush$1 extends ShaderBrush {
    public final /* synthetic */ Shader c;

    public BrushKt$ShaderBrush$1(Shader shader) {
        this.c = shader;
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    public final Shader b(long j) {
        return this.c;
    }
}
