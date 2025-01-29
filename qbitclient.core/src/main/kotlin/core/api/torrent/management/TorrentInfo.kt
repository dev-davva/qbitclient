package core.api.torrent.management

import core.json.JsonProperty

data class TorrentInfo(
    /**
     * The time when the torrent was added to the client (Unix Epoch)
     */
    @JsonProperty("added_on")
    val addedOn: Int,

    /**
     * Amount of data left to download (bytes)
     */
    @JsonProperty("amount_left")
    val amountLeft: Int,

    /**
     * Whether this torrent is managed by Automatic Torrent Management
     */
    @JsonProperty("auto_tmm")
    val autoTmm: Boolean,

    /**
     * Percentage of file pieces currently available
     */
    @JsonProperty("availability")
    val availability: Int,

    /**
     * Category of the torrent
     */
    @JsonProperty("category")
    val category: String,

    /**
     * Amount of transfer data completed (bytes)
     */
    @JsonProperty("completed")
    val completed: Int,

    /**
     * Time when the torrent completed (Unix Epoch)
     */
    @JsonProperty("completion_on")
    val completionOn: Int,

    /**
     * Absolute path of torrent content (root path for multifile torrents, absolute file path for singlefile torrents)
     */
    @JsonProperty("content_path")
    val contentPath: String,

    /**
     * Torrent download speed limit (bytes/s). -1 if unlimited.
     */
    @JsonProperty("dl_limit")
    val dlLimit: Int,

    /**
     * Torrent download speed (bytes/s)
     */
    @JsonProperty("dlspeed")
    val dlspeed: Int,

    /**
     * Amount of data downloaded
     */
    @JsonProperty("downloaded")
    val downloaded: Int,

    /**
     * Amount of data downloaded this session
     */
    @JsonProperty("downloaded_session")
    val downloadedSession: Int,

    /**
     * Torrent ETA (seconds)
     */
    @JsonProperty("eta")
    val eta: Int,

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
    val lastActivity: Int,

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
    val maxSeedingTime: Int,

    /**
     * Torrent name
     */
    @JsonProperty("name")
    val name: String,

    /**
     * Number of seeds in the swarm
     */
    @JsonProperty("num_complete")
    val numComplete: Int,

    /**
     * Number of leechers in the swarm
     */
    @JsonProperty("num_incomplete")
    val numIncomplete: Int,

    /**
     * Number of leechers connected to
     */
    @JsonProperty("num_leechs")
    val numLeechs: Int,

    /**
     * Number of seeds connected to
     */
    @JsonProperty("num_seeds")
    val numSeeds: Int,

    /**
     * Torrent priority. Returns -1 if queuing is disabled or torrent is in seed mode
     */
    @JsonProperty("priority")
    val priority: Int,

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
    val seedingTimeLimit: Int,

    /**
     * Time when this torrent was last seen complete (Unix Epoch)
     */
    @JsonProperty("seen_complete")
    val seenComplete: Int,

    /**
     * True if sequential download is enabled
     */
    @JsonProperty("seq_dl")
    val seqDl: Boolean,

    /**
     * Total size (bytes) of files selected for download
     */
    @JsonProperty("size")
    val size: Int,

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
    val timeActive: Int,

    /**
     * Total size (bytes) of all file in this torrent (including unselected ones)
     */
    @JsonProperty("total_size")
    val totalSize: Int,

    /**
     * The first tracker with working status. Returns empty string if no tracker is working.
     */
    @JsonProperty("tracker")
    val tracker: String,

    /**
     * Torrent upload speed limit (bytes/s). -1 if unlimited.
     */
    @JsonProperty("up_limit")
    val upLimit: Int,

    /**
     * Amount of data uploaded
     */
    @JsonProperty("uploaded")
    val uploaded: Int,

    /**
     * Amount of data uploaded this session
     */
    @JsonProperty("uploaded_session")
    val uploadedSession: Int,

    /**
     * Torrent upload speed (bytes/s)
     */
    @JsonProperty("upspeed")
    val upspeed: Int
)


