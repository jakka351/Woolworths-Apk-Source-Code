package com.scandit.datacapture.core.internal.sdk.common.feedback;

import com.scandit.datacapture.core.common.feedback.AssetSound;
import com.scandit.datacapture.core.common.feedback.Feedback;
import com.scandit.datacapture.core.common.feedback.Sound;
import com.scandit.datacapture.core.common.feedback.Vibration;
import com.scandit.datacapture.core.common.feedback.WaveFormVibration;
import com.scandit.datacapture.core.json.JsonValue;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/common/feedback/FeedbackDeserializer;", "", "Lcom/scandit/datacapture/core/json/JsonValue;", "json", "Lcom/scandit/datacapture/core/common/feedback/Feedback;", "fromJson", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class FeedbackDeserializer {

    @NotNull
    public static final FeedbackDeserializer INSTANCE = new FeedbackDeserializer();

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f18680a = {"default", "selectionHaptic", "successHaptic", "impactHaptic", "impactHapticLight", "failureHaptic"};

    private FeedbackDeserializer() {
    }

    @JvmStatic
    @NotNull
    public static final Feedback fromJson(@NotNull JsonValue json) {
        Sound soundDefaultSound;
        Vibration waveFormVibration;
        Intrinsics.h(json, "json");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        JsonValue byKeyAsObject = json.getByKeyAsObject("vibration", null);
        if (byKeyAsObject != null) {
            String byKeyAsString = byKeyAsObject.getByKeyAsString("type", "default");
            String[] strArr = f18680a;
            if (ArraysKt.l(strArr, byKeyAsString)) {
                waveFormVibration = Vibration.INSTANCE.defaultVibration();
            } else {
                if (!Intrinsics.c(byKeyAsString, "waveForm")) {
                    throw new IllegalStateException((byKeyAsObject.getAbsolutePath() + ".type is required to be one of [" + ArraysKt.U(strArr, null, null, null, null, 63) + ", waveForm].").toString());
                }
                ArrayList arrayList = new ArrayList();
                JsonValue byKeyAsArray = byKeyAsObject.getByKeyAsArray("timings", null);
                if (byKeyAsArray != null) {
                    int size = (int) byKeyAsArray.getSize();
                    for (int i = 0; i < size; i++) {
                        arrayList.add(Integer.valueOf(byKeyAsArray.requireByIndex(i).asInt()));
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                JsonValue byKeyAsArray2 = byKeyAsObject.getByKeyAsArray("amplitudes", null);
                if (byKeyAsArray2 != null) {
                    int size2 = (int) byKeyAsArray2.getSize();
                    for (int i2 = 0; i2 < size2; i2++) {
                        arrayList2.add(Integer.valueOf(byKeyAsArray2.requireByIndex(i2).asInt()));
                    }
                }
                ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList3.add(Long.valueOf(((Number) it.next()).intValue()));
                }
                waveFormVibration = new WaveFormVibration(CollectionsKt.H0(arrayList3), arrayList2.isEmpty() ? null : CollectionsKt.F0(arrayList2));
            }
            objectRef.d = waveFormVibration;
        }
        JsonValue byKeyAsObject2 = json.getByKeyAsObject("sound", null);
        if (byKeyAsObject2 != null) {
            if (byKeyAsObject2.contains("resource")) {
                String strRequireByKeyAsString = byKeyAsObject2.requireByKeyAsString("resource");
                if (StringsKt.D(strRequireByKeyAsString)) {
                    throw new IllegalStateException((byKeyAsObject2.getAbsolutePath() + " does not reference a valid asset file in assets/ .").toString());
                }
                soundDefaultSound = new AssetSound(strRequireByKeyAsString);
            } else {
                soundDefaultSound = Sound.INSTANCE.defaultSound();
            }
            objectRef2.d = soundDefaultSound;
        }
        return new Feedback((Vibration) objectRef.d, (Sound) objectRef2.d);
    }
}
