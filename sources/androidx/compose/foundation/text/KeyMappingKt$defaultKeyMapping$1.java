package androidx.compose.foundation.text;

import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class KeyMappingKt$defaultKeyMapping$1 extends PropertyReference1Impl {
    public static final KeyMappingKt$defaultKeyMapping$1 d = new KeyMappingKt$defaultKeyMapping$1(KeyEvent_androidKt.class, "isCtrlPressed", "isCtrlPressed-ZmokQxo(Landroid/view/KeyEvent;)Z", 1);

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        return Boolean.valueOf(((KeyEvent) obj).f1844a.isCtrlPressed());
    }
}
