package core.api.torrent.management

import core.json.JsonProperty

data class TorrentInfo(
    /**
     * The time when the torrent was added to the client (Unix Epoch)
     */
    @JsonProperty("added_on")
    val addedOn: Long,

    /**
     * Amount of data left to download (bytes)
     */
    @JsonProperty("amount_left")
    val amountLeft: Long,

    /**
     * Whether this torrent is managed by Automatic Torrent Management
     */
    @JsonProperty("auto_tmm")
    val autoTmm: Boolean,

    /**
     * Percentage of file pieces currently available
     */
    @JsonProperty("availability")
    val availability: Long,

    /**
     * Category of the torrent
     */
    @JsonProperty("category")
    val category: String,

    /**
     * Amount of transfer data completed (bytes)
     */
    @JsonProperty("completed")
    val completed: Long,

    /**
     * Time when the torrent completed (Unix Epoch)
     */
    @JsonProperty("completion_on")
    val completionOn: Long,

    /**
     * Absolute path of torrent content (root path for multifile torrents, absolute file path for singlefile torrents)
     */
    @JsonProperty("content_path")
    val contentPath: String,

    /**
     * Torrent download speed limit (bytes/s). -1 if unlimited.
     */
    @JsonProperty("dl_limit")
    val dlLimit: Long,

    /**
     * Torrent download speed (bytes/s)
     */
    @JsonProperty("dlspeed")
    val dlspeed: Long,

    /**
     * Amount of data downloaded
     */
    @JsonProperty("downloaded")
    val downloaded: Long,

    /**
     * Amount of data downloaded this session
     */
    @JsonProperty("downloaded_session")
    val downloadedSession: Long,

    /**
     * Torrent ETA (seconds)
     */
    @JsonProperty("eta")
    val eta: Long,

    /**
     * True if first last piece are prioritized
     */
    @JsonProperty("f_l_piece_prio")
    val fLPiecePrio: Boolean,

    /**
     * True if force start is enabled for this torrent
     */
    @JsonProperty("force_start")
    val forceStart: Boolean,

    /**
     * Torrent hash
     */
    @JsonProperty("hash")
    val hash: String,

    /**
     * Last time when a chunk was downloaded/uploaded (Unix Epoch)
     */
    @JsonProperty("last_activity")
    val lastActivity: Long,

    /**
     * Magnet URI corresponding to this torrent
     */
    @JsonProperty("magnet_uri")
    val magnetUri: String,

    /**
     * Maximum share ratio until torrent is stopped from seeding/uploading
     */
    @JsonProperty("max_ratio")
    val maxRatio: Double,

    /**
     * Maximum seeding time (seconds) until torrent is stopped from seeding
     */
    @JsonProperty("max_seeding_time")
    val maxSeedingTime: Long,

    /**
     * Torrent name
     */
    @JsonProperty("name")
    val name: String,

    /**
     * Number of seeds in the swarm
     */
    @JsonProperty("num_complete")
    val numComplete: Long,

    /**
     * Number of leechers in the swarm
     */
    @JsonProperty("num_incomplete")
    val numIncomplete: Long,

    /**
     * Number of leechers connected to
     */
    @JsonProperty("num_leechs")
    val numLeechs: Long,

    /**
     * Number of seeds connected to
     */
    @JsonProperty("num_seeds")
    val numSeeds: Long,

    /**
     * Torrent priority. Returns -1 if queuing is disabled or torrent is in seed mode
     */
    @JsonProperty("priority")
    val priority: Long,

    /**
     * Torrent progress (percentage/100)
     */
    @JsonProperty("progress")
    val progress: Double,

    /**
     * Torrent share ratio. Max ratio value: 9999.
     */
    @JsonProperty("ratio")
    val ratio: Double,

    /**
     * TODO (what is different from max_ratio?)
     */
    @JsonProperty("ratio_limit")
    val ratioLimit: Double,

    /**
     * Path where this torrent's data is stored
     */
    @JsonProperty("save_path")
    val savePath: String,

    /**
     * TODO (what is different from max_seeding_time?) seeding_time_limit is a per torrent setting, when Automatic Torrent Management is disabled, furthermore then max_seeding_time is set to seeding_time_limit for this torrent. If Automatic Torrent Management is enabled, the value is -2. And if max_seeding_time is unset it have a default value -1.
     */
    @JsonProperty("seeding_time_limit")
    val seedingTimeLimit: Long,

    /**
     * Time when this torrent was last seen complete (Unix Epoch)
     */
    @JsonProperty("seen_complete")
    val seenComplete: Long,

    /**
     * True if sequential download is enabled
     */
    @JsonProperty("seq_dl")
    val seqDl: Boolean,

    /**
     * Total size (bytes) of files selected for download
     */
    @JsonProperty("size")
    val size: Long,

    /**
     * Torrent state. See table here below for the possible values
     */
    @JsonProperty("state")
    val state: String,

    /**
     * True if super seeding is enabled
     */
    @JsonProperty("super_seeding")
    val superSeeding: Boolean,

    /**
     * Comma-concatenated tag list of the torrent
     */
    @JsonProperty("tags")
    val tags: String,

    /**
     * Total active time (seconds)
     */
    @JsonProperty("time_active")
    val timeActive: Long,

    /**
     * Total size (bytes) of all file in this torrent (including unselected ones)
     */
    @JsonProperty("total_size")
    val totalSize: Long,

    /**
     * The first tracker with working status. Returns empty string if no tracker is working.
     */
    @JsonProperty("tracker")
    val tracker: String,

    /**
     * Torrent upload speed limit (bytes/s). -1 if unlimited.
     */
    @JsonProperty("up_limit")
    val upLimit: Long,

    /**
     * Amount of data uploaded
     */
    @JsonProperty("uploaded")
    val uploaded: Long,

    /**
     * Amount of data uploaded this session
     */
    @JsonProperty("uploaded_session")
    val uploadedSession: Long,

    /**
     * Torrent upload speed (bytes/s)
     */
    @JsonProperty("upspeed")
    val upspeed: Long
)


