package net.sixik.sdmcrtplus.CrT.integration.ftbteam.events;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import dev.ftb.mods.ftbteams.property.TeamProperties;
import net.sixik.sdmcrtplus.source.integration.ftbteam.events.CustomTeamPropertiesChangedEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister(modDeps = "ftbteams")
@Document("mods/sdmcrtplus/integration/ftbteams/events/CustomTeamPropertiesChangedEvent")
@NativeTypeRegistration(value = CustomTeamPropertiesChangedEvent.class,zenCodeName = "mods.sdmcrtplus.integration.ftbteams.events.CustomTeamPropertiesChangedEvent")
public class ExpandCustomTeamPropertiesChangedEvent {

    @ZenCodeType.Method
    public static TeamProperties getOldProperties(CustomTeamPropertiesChangedEvent event){
        return event.getOldProperties();
    }
}
