package com.scandit.datacapture.core.ui.control;

import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.common.geometry.MeasureUnit;
import com.scandit.datacapture.core.ui.control.LinearControlGroup;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes6.dex */
final class h implements LinearControlGroup.Defaults {

    /* renamed from: a, reason: collision with root package name */
    public static final h f18916a = new h();
    private static final LinearControlGroupOrientation b = LinearControlGroupOrientation.VERTICAL;
    private static final FloatWithUnit c = new FloatWithUnit(16.0f, MeasureUnit.DIP);
    private static final List d = EmptyList.d;

    private h() {
    }

    @Override // com.scandit.datacapture.core.ui.control.LinearControlGroup.Defaults
    public final List getControls() {
        return d;
    }

    @Override // com.scandit.datacapture.core.ui.control.LinearControlGroup.Defaults
    public final LinearControlGroupOrientation getOrientation() {
        return b;
    }

    @Override // com.scandit.datacapture.core.ui.control.LinearControlGroup.Defaults
    public final FloatWithUnit getSpacing() {
        return c;
    }
}
