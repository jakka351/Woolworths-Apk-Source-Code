package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/ChipDefaults;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ExperimentalMaterialApi
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ChipDefaults {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1251a = 32;

    public static ChipColors a(long j, Composer composer, int i) {
        long jG = (i & 1) != 0 ? ColorKt.g(Color.b(MaterialTheme.a(composer).d(), 0.12f), MaterialTheme.a(composer).g()) : j;
        long jB = Color.b(MaterialTheme.a(composer).d(), 0.87f);
        long jB2 = Color.b(jB, 0.54f);
        return new DefaultChipColors(jG, jB, jB2, ColorKt.g(Color.b(MaterialTheme.a(composer).d(), ContentAlpha.a(0.38f, 0.38f, composer) * 0.12f), MaterialTheme.a(composer).g()), Color.b(jB, ContentAlpha.a(0.38f, 0.38f, composer) * 0.87f), Color.b(jB2, ContentAlpha.a(0.38f, 0.38f, composer) * 0.54f));
    }

    public static SelectableChipColors b(long j, long j2, long j3, long j4, long j5, long j6, Composer composer, int i) {
        float f;
        long jG;
        long jG2 = (i & 1) != 0 ? ColorKt.g(Color.b(MaterialTheme.a(composer).d(), 0.12f), MaterialTheme.a(composer).g()) : j;
        long jB = (i & 2) != 0 ? Color.b(MaterialTheme.a(composer).d(), 0.87f) : j2;
        long jB2 = Color.b(jB, 0.54f);
        if ((i & 8) != 0) {
            f = 0.87f;
            jG = ColorKt.g(Color.b(MaterialTheme.a(composer).d(), ContentAlpha.a(0.38f, 0.38f, composer) * 0.12f), MaterialTheme.a(composer).g());
        } else {
            f = 0.87f;
            jG = j3;
        }
        return new DefaultSelectableChipColors(jG2, jB, jB2, jG, (i & 16) != 0 ? Color.b(jB, ContentAlpha.a(0.38f, 0.38f, composer) * f) : j4, Color.b(jB2, ContentAlpha.a(0.38f, 0.38f, composer) * 0.54f), (i & 64) != 0 ? ColorKt.g(Color.b(MaterialTheme.a(composer).d(), 0.12f), jG2) : j5, (i & 128) != 0 ? ColorKt.g(Color.b(MaterialTheme.a(composer).d(), 0.16f), jB) : j6, ColorKt.g(Color.b(MaterialTheme.a(composer).d(), 0.16f), jB2));
    }
}
