package com.adobe.marketing.mobile;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/adobe/marketing/mobile/ConfigType;", "", "AppID", "Bundled", "FileInAssets", "FileInPath", "Lcom/adobe/marketing/mobile/ConfigType$AppID;", "Lcom/adobe/marketing/mobile/ConfigType$Bundled;", "Lcom/adobe/marketing/mobile/ConfigType$FileInAssets;", "Lcom/adobe/marketing/mobile/ConfigType$FileInPath;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public interface ConfigType {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/ConfigType$AppID;", "Lcom/adobe/marketing/mobile/ConfigType;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class AppID implements ConfigType {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AppID);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "AppID(appID=null)";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/ConfigType$Bundled;", "Lcom/adobe/marketing/mobile/ConfigType;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Bundled implements ConfigType {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/ConfigType$FileInAssets;", "Lcom/adobe/marketing/mobile/ConfigType;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class FileInAssets implements ConfigType {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FileInAssets);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "FileInAssets(filePath=null)";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/ConfigType$FileInPath;", "Lcom/adobe/marketing/mobile/ConfigType;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class FileInPath implements ConfigType {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FileInPath);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "FileInPath(filePath=null)";
        }
    }
}
