package androidx.compose.ui.text.platform.style;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.text.platform.AndroidTextPaint_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/platform/style/ShaderBrushSpan;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ShaderBrushSpan extends CharacterStyle implements UpdateAppearance {
    public final ShaderBrush d;
    public final float e;
    public final MutableState f = SnapshotStateKt.f(new Size(9205357640488583168L));
    public final State g = SnapshotStateKt.d(new Function0<Shader>() { // from class: androidx.compose.ui.text.platform.style.ShaderBrushSpan$shaderState$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ShaderBrushSpan shaderBrushSpan = this.h;
            MutableState mutableState = shaderBrushSpan.f;
            if (((Size) ((SnapshotMutableStateImpl) mutableState).getD()).f1754a == 9205357640488583168L || Size.e(((Size) ((SnapshotMutableStateImpl) mutableState).getD()).f1754a)) {
                return null;
            }
            return shaderBrushSpan.d.b(((Size) ((SnapshotMutableStateImpl) mutableState).getD()).f1754a);
        }
    });

    public ShaderBrushSpan(ShaderBrush shaderBrush, float f) {
        this.d = shaderBrush;
        this.e = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        AndroidTextPaint_androidKt.a(textPaint, this.e);
        textPaint.setShader((Shader) this.g.getD());
    }
}
