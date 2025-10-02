package com.adobe.marketing.mobile.services.ui;

import com.adobe.marketing.mobile.services.ui.Presentation;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/Presentable;", "Lcom/adobe/marketing/mobile/services/ui/Presentation;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "State", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public interface Presentable<T extends Presentation<?>> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/Presentable$State;", "", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class State {
        public static final /* synthetic */ State[] d = {new State("VISIBLE", 0), new State("HIDDEN", 1), new State("DETACHED", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        State EF5;

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) d.clone();
        }
    }
}
