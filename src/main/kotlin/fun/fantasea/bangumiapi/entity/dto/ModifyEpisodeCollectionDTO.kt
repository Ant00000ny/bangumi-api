package `fun`.fantasea.bangumiapi.entity.dto

import com.fasterxml.jackson.annotation.JsonProperty
import `fun`.fantasea.bangumiapi.entity.EpisodeCollectionType

data class ModifyEpisodeCollectionDTO(
    @JsonProperty("episode_id")
    val episodeId: List<String>,
    @JsonProperty("type")
    val type: EpisodeCollectionType,
)
